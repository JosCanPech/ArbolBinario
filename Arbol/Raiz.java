public class Raiz {
    
    NodoBin raiz;
    
    public Raiz(){
        raiz = null;
    }
    
    public boolean Vacio(){
        return raiz == null;
    }
    
    public void Insertar(String Val){
        NodoBin nuevo = new NodoBin(Val);
        if(raiz  == null){
            raiz = nuevo;
        }else{
            NodoBin Temp = raiz;
            NodoBin principal;
            while(true){
                principal = Temp;
                if(Val.compareTo(Temp.Info)<=0){
                    Temp = Temp.Izquierda;
                    if(Temp == null){
                        principal.Izquierda = nuevo;
                        return;
                    }
                    
                }else{
                    Temp = Temp.Derecha;
                    if(Temp == null){
                        principal.Derecha = nuevo;
                        return;
                    }
                }
            }
            
            
        }
    }
    
  public void RecInOrden(NodoBin Value){
      if(Value != null){
          RecInOrden(Value.Izquierda);
          System.out.print(Value.Info+", ");
          RecInOrden(Value.Derecha);
      }
     }
      
  }
   
