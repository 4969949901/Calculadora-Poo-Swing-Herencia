
public class CalculadoraAvanzada extends CalculadoraBasica {
    
    //Atributos
    private String digitoCal;
    private double resultados;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean raiz;
    private boolean cuadrado;
    private boolean logaritmo;
    private boolean su;
    private boolean contangente;
    private boolean  secante;
    private boolean cosecante;
    //Constructor
    public CalculadoraAvanzada() {
        this.digitoCal = "";
        this.resultados = 0;
        this.seno = false;
        this.coseno = false;
        this.tangente = false;
        this.raiz = false;
        this.cuadrado = false;
        this.logaritmo = false;
        this.su=false;
        this.contangente=false;
        this.secante=false;
        this.cosecante=false;
     
    }
    //Se utiliza getter and setter
    @Override
    public String getDigitoCal() {
        return digitoCal;
    }

    @Override
    public void setDigitoCal(String digitoCal) {
        this.digitoCal = digitoCal;
    }
    
    //Aqui empieza la sección de metodos
     public void agregarDigitos(int numero){
        setDigitoCal(digitoCal+numero);
       
     }
    public void seno(String numero){
     
     this.resultados=Double.parseDouble(numero);
     seno=true;
     setDigitoCal("");
    }
    public void coseno(String  numero){
     this.resultados=Double.parseDouble(numero);
     coseno=true;
     setDigitoCal("");
    }
    public void tangente(String numero){
     this.resultados=Double.parseDouble(numero);
     tangente=true;
     setDigitoCal("");
    }
    
    public void raiz(String numero){
     this.resultados=Double.parseDouble(numero);
     raiz=true;
     setDigitoCal("");
    }
    public void logaritmo(String numero){
     this.resultados=Double.parseDouble(numero);
     logaritmo=true;
     setDigitoCal("");
    }
    public void cuadrado(String numero){
     this.resultados=Double.parseDouble(numero);
    cuadrado=true;
     setDigitoCal("");
    }
    public void su(String numero){
     this.resultados=Double.parseDouble(numero );
     su=true;
     setDigitoCal("");
    }
    public void contangente(String numero){
     this.resultados=Double.parseDouble(numero );
     contangente=true;
     setDigitoCal("");
    }
    public void secante(String numero){
     this.resultados=Double.parseDouble(numero );
    secante=true;
     setDigitoCal("");
    }
    public void cosecante(String numero){
     this.resultados=Double.parseDouble(numero );
     cosecante=true;
     setDigitoCal("");
    }
    
    public double resultadoOps(String numero){
        if (seno==true){
            double seno=Math.toRadians(resultados);
            resultados=Math.sin(seno);
        }else if(coseno==true){
            double coseno=Math.toRadians(resultados);
            resultados=Math.cos(coseno);
        }else if(tangente==true){
            double tangente=Math.toRadians(resultados);
            resultados=Math.tan(tangente);
        }else if(contangente==true){
            double contangente=Math.toRadians(resultados);
            resultados=1/Math.tan(contangente);
        }else if(secante==true){
            double secante=Math.toRadians(resultados);
            resultados=1/Math.cos(secante);
        }else if(cosecante==true){
            double cosecante=Math.toRadians(resultados);
            resultados=1/Math.sin(cosecante);
        }else if(raiz==true){
            resultados=Math.sqrt(Double.parseDouble(numero));
        }else if(logaritmo==true){
            resultados=Math.log(resultados);
        }else if(cuadrado==true){
            resultados=Math.pow(resultados, 2);
        }else if(su==true){
         resultados=resultados + Double.parseDouble(numero);
        }
        
        //reseteo de valores para que el siguien ejecucion se limpie
          seno=false;
          coseno=false;
          tangente=false;
          logaritmo=false;
          cuadrado=false;
          raiz=false;
          su=false;
          secante=false;
          contangente=false;
          cosecante=false;
     //Se retorna un valor
        return resultados;
        
     }

  
}
