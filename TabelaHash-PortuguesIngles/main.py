import hashlib
import os

clear = lambda: os.system('cls')

class TabelaHash:
    def __init__(self):
        self.tamanho = 3000
        self.index = [None] * self.tamanho
        self.valores = [None] * self.tamanho

    def inserir(self, key, valor):
        hashvalue = self.funcaoHash(key, len(self.index))

        if self.index[hashvalue] == None:
            self.index[hashvalue] = key
            self.valores[hashvalue] = valor
        else:
            if self.index[hashvalue] == key:
                self.valores[hashvalue] = valor
            else:
                nextslot = self.refazer(hashvalue, len(self.index))
                while self.index[nextslot] != None and \
                        self.index[nextslot] != key:
                    nextslot = self.refazer(nextslot, len(self.index))

                if self.index[nextslot] == None:
                    self.index[nextslot] = key
                    self.valores[nextslot] = valor
                else:
                    self.valores[nextslot] = valor

    def funcaoHash(self, key, tamanho):
        return key % tamanho

    def refazer(self, oldhash, tamanho):
        return (oldhash + 1) % tamanho

    def buscar(self, key):
        posicaoStart = self.funcaoHash(key, len(self.index))

        valor = None
        parar = False
        encontrado = False
        posicao = posicaoStart
        while self.index[posicao] != None and \
                not encontrado and not parar:
            if self.index[posicao] == key:
                encontrado = True
                valor = self.valores[posicao]
            else:
                posicao = self.refazer(posicao, len(self.index))
                if posicao == posicaoStart:
                    parar = True
        return valor

    def __getitem__(self, key):
        return self.buscar(key)

    def __setitem__(self, key, valor):
        self.inserir(key, valor)


def buscar_palavra(tipo, palavra):
    if tipo == "en":
        contador = 0
        for x in ENEncode.valores:
            if palavra == x:
                y = ENEncode.index[contador]
                traducaoHash = PTEncode.valores[y]
                traducaoNormal = PTDecode.valores[y]
                return y, x, [traducaoHash, traducaoNormal]
                break
            else:
                contador += 1
    else:
        contador = 0
        for x in PTEncode.valores:
            if palavra == x:
                y = PTEncode.index[contador]
                traducaoHash = ENEncode.valores[y]
                traducaoNormal = ENDecode.valores[y]
                return y, x, [traducaoHash, traducaoNormal]
                break
            else:
                contador += 1


ENEncode = TabelaHash()
PTEncode = TabelaHash()
PTDecode = TabelaHash()
ENDecode = TabelaHash()
inglesFile = open("ingles.txt", "r")
for item in inglesFile.read().splitlines():
    item = item.split(". ")
    md5 = hashlib.md5()
    md5.update(item[1].encode('utf-8'))
    ENEncode[int(item[0])] = md5.hexdigest()
    ENDecode[int(item[0])] = item[1]
portuguesFile = open("portugues.txt", "r", encoding="utf8")
for item in portuguesFile.read().splitlines():
    item = item.split(". ")
    md5 = hashlib.md5()
    md5.update(item[1].encode('utf-8'))
    PTEncode[int(item[0])] = md5.hexdigest()
    PTDecode[int(item[0])] = item[1]

while True:
    clear()
    print("""Escolha a ordem de tradução
    1- Inglês-Português
    2- Português-Inglês""")
    op = input("digite sua opção: ")

    try:
        if str(op) == "1":
            palavra = input("digite uma palavra: ")
            md5 = hashlib.md5()
            md5.update(palavra.encode('utf-8'))
            palavraHash = md5.hexdigest()
            resultado = buscar_palavra("en", palavraHash)
            print(f"""
            Index: {resultado[0]}
            Palavra: {palavra} ({resultado[1]})
            Tradução: {resultado[2][1]} ({resultado[2][0]})
""")
        elif str(op) == "2":
            palavra = input("digite uma palavra: ")
            md5 = hashlib.md5()
            md5.update(palavra.encode('utf-8'))
            palavraHash = md5.hexdigest()
            resultado = buscar_palavra("pt", palavraHash)
            print(f"""
            Index: {resultado[0]}
            Palavra: {palavra} ({resultado[1]})
            Tradução: {resultado[2][1]} ({resultado[2][0]})
""")
        else:
            print("\nERRO: opcao invalida\n")
    except:
        print("\nERRO: palavra não encontrada\n")
