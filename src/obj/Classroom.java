package obj;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    List<Table> tableList= new ArrayList<>();
    int NumOfstudent ;
    String visualDevice;
    public Classroom(List<Table> tableList,int NumOfStudent,String visualDevice ){
        this.tableList= tableList;
        this.NumOfstudent= NumOfStudent;
        this.visualDevice = visualDevice;
    }

}
