package car.example.bean;

public class MyBean {
    private String message;


    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Message" + message);
    }

    public String toString(){
        return "MyBean{" + "message='" +
                message +'\'' +  '}';
    }
}
