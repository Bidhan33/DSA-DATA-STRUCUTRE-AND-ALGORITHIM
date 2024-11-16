// JavaScript program to find number of subset
// containing consecutive numbers

    function numofsubset(arr) {
    
    // Sort the array so that consecutive elements
    // become consecutive in the array.
    arr.sort((a, b) => a - b);

    let count = 1;
    for(let i = 0; i < arr.length - 1; i++) {
        
        // Check if there's a break between
        // consecutive numbers
        if(arr[i] + 1 !== arr[i + 1])
            count++;
    }

    return count;
}

function main() {
    let arr = [100, 56, 5, 6, 102, 58, 101, 57, 7, 103, 59];
    console.log(numofsubset(arr));
}

main();
