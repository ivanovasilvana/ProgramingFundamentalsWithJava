package ObjectsAndClasses_06.Lab.Songs_04;

public class Songs {
    private String type;
    private String name;
    private String time;

    public Songs(String typeList, String name, String time){
        this.type = typeList;
        this.name = name;
        this.time = time;
    }
    public String getName(){
        return this.name;
    }
    public  String getType(){
        return this.type;
    }
}
