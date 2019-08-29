package selectionSortObject;

//Comparable接口后，能够排序，能够比较两个实例
public class Student implements Comparable<Student> {
    String name;
    int score;

    Student(){
        this.name="";
        this.score=0;
    }

    Student(String name,int score){
        this.name=name;
        this.score=score;
    }


    @Override
    public int compareTo(Student o) {
        return this.score-o.score;
    }

    @Override
    public String toString() {
        return "(name:"+this.name+" score:"+this.score+")";
    }

}
