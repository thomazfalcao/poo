class Bateria {
    int carga = 100;
    
    int getCarga(){
        return carga;
    }
    void setCarga(int carga){
        if (carga > 100)
            this.carga = 100;
        else if (carga < 0)
            this.carga = 0;
        else
            this.carga = carga;
    }
}
