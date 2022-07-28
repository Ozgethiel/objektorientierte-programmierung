package uebungen.b_juni.g_lightswitch;

public class Switch {

    private Light myLight;

    public Switch(Light myLight) {

        this.myLight = myLight;
    }

    public void toggle() {

        if (myLight.istIlluminated()) {
            myLight.setIlluminated(false);
        } else {
            myLight.setIlluminated(true);
        }
    }
}

