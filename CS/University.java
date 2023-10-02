package CS;

public class University {
        Lab lab[];

    public Lab[] getLab() {
        return lab;
    }

    public void setLab(Lab[] lab) {
        this.lab = lab;
    }

    public Lab getLabById(String Id) {
            for (Lab labs : lab) {
                if (lab != null && labs.getLab().equals(Id)) {
                    return labs;
                }
            }
            return null;
    }
}
