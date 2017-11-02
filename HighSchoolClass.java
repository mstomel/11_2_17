public class HighSchoolClass{
    private Student[] students;

    public Student getValedictorian(){
        String vale = "";
        val = 0;
        for(int i = 0; i < students.length;i++){
            if(students[i] > val){
                vale = students[i];
                val = students[i].getGPA();
            }
            return vale;
        }

    }
    public double getHonorsPercent(){
        int a = 0;
        for (int i = 0;i < students.length;i++){
            if(students[i].isHonors){
                a++
            }
        }
        return a/students.length;
    }


}
