public enum EndPoints {

    ADDUSER("/AddUser"),
    DELETEUSER("/DeleteUser"),
    FİNDUSER("/FindUser"),
    GETTYPEOFUSER("/GetTypeUser"),
    GETALLUSERS("/GetAllUsers");

    final String endPoints;

    EndPoints(String endPoints){
        this.endPoints = endPoints;
    }
}
