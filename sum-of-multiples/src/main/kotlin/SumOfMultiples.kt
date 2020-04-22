object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val multiples = mutableSetOf<Int>();
        for(value in factors.minus(0)){
            for( i in 1..limit/value){
                if(value*i < limit){
                    multiples.add(value*i)
                }
            }
        }
        return multiples.sum();
    }
}
