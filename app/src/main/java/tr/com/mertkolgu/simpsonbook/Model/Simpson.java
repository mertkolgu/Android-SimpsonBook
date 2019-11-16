package tr.com.mertkolgu.simpsonbook.Model;

import java.io.Serializable;

public class Simpson implements Serializable {

    private String name;
    private String job;
    private int pictureInteger;

    public Simpson(String name, String job, int pictureInteger) {
        this.name = name;
        this.job = job;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }

    public void setPictureInteger(int pictureInteger) {
        this.pictureInteger = pictureInteger;
    }
}
