import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("catBean")

public class Cat {
    public Cat(){
    }

    private String catName;


    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
