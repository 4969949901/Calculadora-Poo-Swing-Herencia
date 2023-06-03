
public class CalculadoraBasica {
    //Atributos
    private String digitoCal;
    private double resultados;
    private boolean suma;
    private boolean multiplicacion;
    private boolean division;
    private boolean resta;
    
    // Constructor

    public CalculadoraBasica() {
        this.digitoCal = "";
        this.resultados = 0;
        this.suma = false;
        this.multiplicacion = false;
        this.division = false;
        this.resta = false;
    }
    
    //Coloco el getter an setter de digito ya que se va usar para obtener dato de la interfaz grafica

    public String getDigitoCal() {
        return digitoCal;
    }

    public void setDigitoCal(String digitoCal) {
        this.digitoCal = digitoCal;
    }
    
    //Aqui empieza la sección de metodos
     public void agregarDigito(int numero){
         setDigitoCal(digitoCal+numero);
     }
     
     public void suma(String numero){
     this.resultados=Double.parseDouble(numero); //En la variable resultado se guardara momentaneamente el numero ingresado en la caja de texto antes de proceder a sumar.
     suma=true;
     setDigitoCal("");
     
     }
     
     public void resta(String numero){
     this.resultados=Double.parseDouble(numero);
     resta=true;
     setDigitoCal("");
    }
     
     public void multiplicacion(String numero){
     this.resultados=Double.parseDouble(numero);
     multiplicacion=true;
     setDigitoCal("");
    }
     
    public void division(String numero){
     this.resultados=Double.parseDouble(numero);
     division=true;
     setDigitoCal("");
    }
    
     
     //Funcion para operaciones de suma, resta, multiplicacion y division.
     public double resultadoOperacion(String numero){
     if (suma==true){
     resultados+=Double.parseDouble(numero);
     }if (resta==true){
     resultados-=Double.parseDouble(numero);
     }if (multiplicacion==true){
     resultados*=Double.parseDouble(numero);
     }if (division==true){
     resultados/=Double.parseDouble(numero);
     }
     //reseo de valores para que el siguien ejecucion se limpie
     suma=false;
     resta=false;
     multiplicacion=false;
     division=false;
     
     //Se retorna un valor
     return resultados;
     
     }
     
     
 }
    

