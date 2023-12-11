//complexity

To understand the performance of our code

Types 

1. Space 2. Time

1. Space Complexity: How much space your program is taking during execution

        Ex: Print all even numbers const arr =  [1 , 2, 3 ,4, 5]

        code 1:
             
            const arr =  [1 , 2, 3 ,4, 5]

            const filteredArr = arr.filter((num) => num % 2 === 0)

            for(let evenNum of filteredArr) {
                console.log(evenNum)
            }

        code 2:

            const arr =  [1 , 2, 3 ,4, 5]

            for(let num of arr) {
                if (num % 2 === 0) {
                    console.log(num)
                }
            }

        lets analyze above two codes as per space complexity

        code 1: 

            1. Space required for Arr
            2. Space required for filteredArr

        code 2: 
            
            1. Space required for Arr

2. Time Complexity(big O) : How much time your code will take to execute
    
    Lets analyze above two codes written in space complexity

    Lets assume we have 'n' number of elements in  arr :

        const filteredArr = arr.filter((num) => num % 2 === 0)
        Filtering will take O(n) time complexity
   
        To understand big O notation 

            Usecase 1:
                for(let i = 0 ; i < n ; i ++) {
                    console.log(i)
                }
                for(let j = 0 ; j < m ; j ++) {
                    console.log(j) 
                }
                The above code complexity is

                    O(n) + O(m) 
                    O(n + m)
                    Both Loops are running independently so complexity will be added

            Usecase 2: 
                for(let i = 0 ; i < 6 ; i ++) {
                    
                    for(let j = 0 ; j < 6 ; j ++) {

                        console.log(i , j)
                    }
                }
                    Output:
                        0 0
                        0 1 
                        0 2 
                        0 3
                        ..
                        1 0
                        1 1
                        1 2
                        1 3
                        ..
                Lets Analyze nested loop complexity

                Outer Loop can take 'n' elements and inner loop 'm' 
                O(n) * O(m) 
                O(n * m)
                Both Loops are nested so complexity will be multiplied
            
            Usecase 3: 
                for(let i = 0 ; i < 6 ; i++) {                    
                    for(let j = 0 ; j < 6 ; j++) {                        
                        for(let k = 0 ; k < 6 ; k++) {
                            console.log(i , j , k)
                        }                                             
                    }
                }

            output:
            0 0 0
            0 0 1
            0 0 2
            0 0 3
            0 0 4
            0 0 5
            ...
    


Questions:
    let arr = [1,2 , 3, 4, 5,..... k];
    let newArr = arr.map(num => num*2);
    console.log(arr);

    let newArr2 = [...newArr, ...arr]

    for(let num of newArr) {
        for(let i = 0; i < l; i++) {
            console.log(num*i)
        }
    }