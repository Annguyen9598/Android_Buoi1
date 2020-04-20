object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        TODO("Implement this function to complete the task")
        var Sum : Int = 0;
        for(value in factors){
            var i : Int = 1;
            while (value*i <= limit){
                Sum += value*i;
                i++;
            }
        }
        return Sum;
    }
}
