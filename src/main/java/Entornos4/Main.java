package Entornos4;

public class Main { 

    public static void main(String[] args) {

        eCesta cesta;
        

        cesta = NuevoMetodo();

        try 

        {

            cesta.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }

        try

        {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  "+ bonoactual );

    }
    
    // ¡¡¡¡¡¡¡¡SOY UNA MODIFICACION!!!!!!!
    public void hablar(){
        System.out.println("Soy una modificación");
    }
    
    public static eCesta NuevoMetodo() {
                   try {

                    System.out.println(" Modificación 1");

                     bag.Actualizarbono(-50);

                 } catch (Exception e) {

                           System.out.print("Fallo…….");

                            }
        eCesta cesta;
        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno", 10);
        return cesta;
    }

}