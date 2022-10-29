public enum EndPoints {

    ADDUSER("/AddUser"),
    DELETEUSER("/DeleteUser"),
    FINDUSER("/FindUser"),
    GETTYPEOFUSER("/GetTypeUser"),
    GETALLUSERS("/GetAllUsers");

    final String endPoints;

    EndPoints(String endPoints){
        this.endPoints = endPoints;
    }
}
