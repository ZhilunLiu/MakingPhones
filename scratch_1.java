class Scratch {
    public static void main(String[] args) {
        System.out.print(solution(3));
    }

    public static int solution (int n) {
        // write code here
        int days = 0;
        int result = 0;
        int temp = n;
        while(temp>0){
            days++;
            temp -= days;
        }
        for(int i = 0; i<=days;i++){
            int toBeAdd = (n>=i)?i*i:n*i;
            result += toBeAdd;
            n -= i;
        }
        return result;
    }
}