def prov(int:Int) : Int = {
  if(int%2==0) 1
  else -1
}

val nums = Array(1,2,3,4,5,6,7,8,9,0)


for(i <- 0 until(nums.length); j = prov(i) ; if (i + j) < nums.length) yield nums(i+j)

