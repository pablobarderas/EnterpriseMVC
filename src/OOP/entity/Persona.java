package OOP.entity;

public class Persona implements Comparable<Persona> {
    private int ID;
    private String nombre;
    private String apellido;
    private double numTelefono;
    private String dni;
    private Departments department;

    // hacemos los constructores
    public Persona() {
    }

    public Persona(int iD) {
        ID = iD;
    }

    public Persona(String nombre, String apellido, double numTelefono, String dni) {
        this.ID = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.dni = dni;
        if (!validarDni(dni)) {
            this.dni = "";
        }
    }

    public Persona(int ID, String nombre, String apellido, double numTelefono, String dni) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.dni = dni;
        if (!validarDni(dni)) {
            this.dni = "";
        }
    }

    public Persona(int ID, String nombre, String apellido, double numTelefono, String dni, Departments department) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.dni = dni;
        this.department = department;
        if (!validarDni(dni)) {
            this.dni = "";
        }
    }

    public String nomb() {
        return "Hola " + nombre;
    }

    // si quisiera que fuese en String en vez de un int
    public String numeroTelefono2() {
        return "Mi número de telefono es " + String.valueOf(numTelefono);
    }

    public String apellido() {
        return "Apellido: " + apellido;
    }

    public boolean validarDni(String dni) {
        // Character.isLetter con esto comprobamos si es un caracter
        // dni.charAt(8) con esto sacamos la letra en la posicion 8
        // .matches("\\d+") con el .matches comprobamos si es un digito las \\ si no las
        // pongo no funciona
        // .matches("[0-9]+") con esto comprobamos que sea un numero que va del 0 al 9
        // cuando ponemos al final el + le estamos diciendo que ocurre 1 o mas veces en
        // la cadena
        // si no tengo el + solo lo comprobaria 1 vez
        // ponemos ! porque lo estamos negando
        boolean dniNoValido = dni.length() != 9 ||
                !dni.substring(0, 8).matches("[0-9]+") ||
                !Character.isLetter(dni.charAt(8));

        if (dniNoValido) {
            return false;
        }
        // el if de abajo es la manera menos optima pero si que es la que mas he
        // utilizado
        // if(dni.length() != 9 && Character.isLetter(dni.charAt(8))){
        // return false;
        // }
        // en el .substring el primero es inclusivo y el segundo exclusivo es decir
        // si tengo una palabra coco el primer indix si pongo 0 y el segundo index 3 la
        // palabra que saldria es
        // coc pq excluiria la ultima 0
        int conjuntoNumerosDni = Integer.valueOf(dni.substring(0, 8));
        String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
                "Q", "V", "H", "L", "C", "K", "E" };
        int resto = conjuntoNumerosDni % 23;
        // con esto pasamos siempre la letra del dni que nos ponga el cliente a
        // mayuscula
        char letraMayuscula = Character.toUpperCase(dni.charAt(8));
        return String.valueOf(letraMayuscula).equals(asignacionLetra[resto]);

        // OTRA MANERA
        // boolean letraCorrecta = String.valueOf(dni.charAt(8)) ==
        // asignacionLetra[resto];
        // if(letraCorrecta){
        // return true;
        // }
        // return true;
    }

    // GET y SET
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(double numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (!validarDni(dni)) {
            this.dni = "";
        } else {
            this.dni = dni;
        }
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Persona [ID= " + ID + ", nombre= " + nombre + ", apellido= " + apellido + ", numTelefono= "
                + (int) numTelefono
                + ", dni= " + dni +", Deparment= "+ department+"]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        long temp;
        temp = Double.doubleToLongBits(numTelefono);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (ID != other.ID)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (Double.doubleToLongBits(numTelefono) != Double.doubleToLongBits(other.numTelefono))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    // Comparador por ID por defecto
    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.ID, o.getID());
    }

}
