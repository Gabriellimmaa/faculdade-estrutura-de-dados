public class CarroF1
{
    String equipe;
    String fabri_motor;
    String pneus;
    String cor_predo;
    String piloto1;
    String piloto2;
    float peso;

    public void cadastra(String _equipe, String _fabri_motor, String _pneus, String _cor_predo, String _piloto1, String _piloto2, float _peso){
        this.equipe = _equipe;
        this.fabri_motor = _fabri_motor;
        this.pneus = _pneus;
        this.cor_predo = _cor_predo;
        this.piloto1 = _piloto1;
        this.piloto2 = _piloto2;
        this.peso = _peso;
    }
    
    public String getEquipe(){
        return equipe;
    }
    public String getFabri_motor(){
        return fabri_motor;
    }
    public String getPneus(){
        return pneus;
    }
    public String getCor(){
        return cor_predo;
    }
    public String getPiloto1(){
        return piloto1;
    }
    public String getPiloto2(){
        return piloto2;
    }
    public float getPeso(){
        return peso;
    }

    
}
