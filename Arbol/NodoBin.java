public class NodoBin {
    
    NodoBin Anterior;
    NodoBin Siguiente;
    
    NodoBin Link;
    
    
    public NodoBin getAnterior(){
        return Anterior;
    }
    
    public void setAnterior(NodoBin Anterior){
        this.Anterior = Anterior;
    }
    
    public NodoBin getSiguiente(){
        return Siguiente;
    }
    
    public void setSiguiente(NodoBin Siguiente){
        this.Siguiente = Siguiente;
    }
    
}
