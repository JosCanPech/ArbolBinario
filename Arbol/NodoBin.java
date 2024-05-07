public class NodoBin {
    
    /*Object elemento;
    
    NodoBin Izquierdo;
    NodoBin Derecho;
    
    NodoBin Link;
    
    int Info;
    
    
    public NodoBin(Object e){
        this(e,null, null);
        
    }
    
    public NodoBin(Object e, NodoBin Anterior, NodoBin Siguiente){
        elemento = e;
        Anterior = Anterior;
        Siguiente = Siguiente;
    }
    
    
    
    
    public NodoBin getIzquierdo(){
        return Izquierdo;
    }
    
    /*
    public void setIzquierdo(NodoBin Izquierdo){
        this.Izquierdo = Izquierdo;
    }*/
    /*
    public NodoBin getDerecho(){
        return Derecho;
    }
    
    /*public void setDerecho(NodoBin Derecho){
        this.Derecho = Derecho;
    }*/
   /* 
    public int getInfo(){
        return Info;
    }
    
    public void setInfo(int Info){
        this.Info = Info;
    }
    
    public NodoBin(int Info){
        this.Info = Info;
        this.Izquierdo = null;
        this.Derecho = null;
    }
    
    public void Algoritmo(int info){
        if(2){
            
        }else{
            
        }
        
    }*/
    
    String Info;
    NodoBin Izquierda;
    NodoBin Derecha;
    
    
    public NodoBin(String Info){
        this.Info = Info;
        this.Izquierda = null;
        this.Derecha = null;
    }
    
    public String toString(){
        return "\n El nombre del nodo es: "+Info;
    }
    
    
}
