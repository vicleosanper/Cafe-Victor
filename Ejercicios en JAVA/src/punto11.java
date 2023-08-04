public class punto11 { // Crear arreglos y concatenarlos

        public static void main(String[] args) {

            Persona[] personas = {
                    new Persona("Juan", 25),
                    new Persona("María", 30),
            };

            Empleado[] empleados = {
                    new Empleado("Juan", "Gerente"),
                    new Empleado("María", "Asistente"),
            };

            // Concatenar los arreglos en uno solo
            // Aqui hacemos un arreglo de tipo object, que tendra de longitud, la suma de los arreglos de personas y empleados
            Object[] concatenados = new Object[personas.length + empleados.length];

            //Utilizamos 'System.arraycopy()' para copiar los elementos de los arreglos 'personas' y 'empleados'
            //'System.arraycopy(Desde cual queremos copiar los elementos,Posicion de donde queremos empezar a copiar,El arreglo destino,Posicionde inicio en el arreglo destino, longitud)
            System.arraycopy(personas, 0, concatenados, 0, personas.length);
            System.arraycopy(empleados, 0, concatenados, personas.length, empleados.length);

            // Imprimir los objetos del arreglo concatenado
            for (Object obj : concatenados) {
                // obj instanceof Persona verifica si el objeto obj es una instancia de la clase Persona
                if (obj instanceof Persona) {
                    // Persona persona = (Persona) obj; se utiliza para convertir un objeto de tipo Object al tipo Persona
                    Persona persona = (Persona) obj;
                    System.out.println("Persona - Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
                } else if (obj instanceof Empleado) {
                    Empleado empleado = (Empleado) obj;
                    System.out.println("Empleado - Nombre: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto());
                }
            }
        }
    }

    class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método get para el campo "nombre"
        public String getNombre() {
            return nombre;
        }

        // Método get para el campo "edad"
        public int getEdad() {
            return edad;
        }
    }

    class Empleado {
        private String nombre;
        private String puesto;

        public Empleado(String nombre, String puesto) {
            this.nombre = nombre;
            this.puesto = puesto;
        }

        // Método get para el campo "nombre"
        public String getNombre() {
            return nombre;
        }

        // Método get para el campo "puesto"
        public String getPuesto() {
            return puesto;
        }
    }




