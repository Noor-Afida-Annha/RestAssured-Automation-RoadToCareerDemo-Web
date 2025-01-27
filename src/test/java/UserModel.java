public class UserModel {
    private  String email;
    private String password;
    private String name;
    private String phone_number;
    private String nid;
    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(String email, String password){
        this.email=email;
        this.password=password;
    }

    public UserModel(String name, String phone_number, String nid, String role){
        this.name = name;
        this.phone_number = phone_number;
        this.nid = nid;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public UserModel(){

    }
}
