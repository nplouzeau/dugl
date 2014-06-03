package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public interface Part {
    public void accept(Visitor visitor);

    /**
     * Return the amount of power need by a part.
     * Negative values mean that this part actually produces power.
     * @return
     */
    public double getPowerRequirementsInWatts();
}
