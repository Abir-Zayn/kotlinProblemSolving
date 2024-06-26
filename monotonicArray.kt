fun main(){

    var arr=intArrayOf(1,2,3,5)
    println(isMonotonic(arr));

}
    //Time Complexity is O(n)
    //eg. [1,2,3,5]
    fun isMonotonic(nums: IntArray): Boolean {
        //corner case. If the size is less or equal then its 
        // always be monotonice array
    if (nums.size <= 2) return true

    //considering both increasing and decreasing is true
    var increasing = true
    var decreasing = true

    for (i in 1 until nums.size) {
        //checking for decreasing
        //as its start from 1 then it will be num[i-1] =num[0]
        //iteration ===>   
            // 1< 2 = decreasing =false, increasing = true
            // 2< 3 = dec = false, inc =true
            //...so on.
        if (nums[i - 1] < nums[i]) {
            decreasing = false
        } else if (nums[i - 1] > nums[i]) {
            increasing = false
        }
    }

    // if either increasing and decreasing is true then return true.
    return increasing || decreasing
}



