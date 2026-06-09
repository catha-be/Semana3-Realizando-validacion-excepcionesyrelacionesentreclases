package model;

/**
 * Representa una dirección física asociada a un dueño.
 * Esta clase forma parte de una relación de composición con la clase Dueno o Persona.
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;

    /**
     * Constructor para inicializar una Direccion.
     *
     * @param calle  La calle de la dirección.
     * @param numero El número de la dirección.
     * @param comuna La comuna de la dirección.
     * @param ciudad La ciudad de la dirección.
     */
    public Direccion(String calle, int numero, String comuna, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene la calle.
     *
     * @return La calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle.
     *
     * @param calle La nueva calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número.
     *
     * @return El número.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número.
     *
     * @param numero El nuevo número.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la comuna.
     *
     * @return La comuna.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna.
     *
     * @param comuna La nueva comuna.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Obtiene la ciudad.
     *
     * @return La ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad.
     *
     * @param ciudad La nueva ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return calle + " #" + numero + ", " + comuna + ", " + ciudad;
    }
}
