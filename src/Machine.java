public class Machine {
    private String name;
    private int age;
    private String secret;

    public Machine(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }
}





