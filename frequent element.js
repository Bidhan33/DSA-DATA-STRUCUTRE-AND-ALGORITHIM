// JavaScript implementation to find
// K elements with max occurrence.

function topKFrequent(arr, N, K) {

    let mp = new Map();

    // Put count of all the
    // distinct elements in Map
    // with element as the key &
    // count as the value.
    for (let i = 0; i < N; i++) {

        // Get the count for the
        // element if already present in the
        // Map or get the default value which is 0.

        if (mp.has(arr[i])) {
            mp.set(arr[i], mp.get(arr[i]) + 1)
        } else {
            mp.set(arr[i], 1)
        }
    }

    // Create a list from elements of HashMap
    let list = [...mp];

    // Sort the list
    list.sort((o1, o2) => {
        if (o1[1] == o2[1])
            return o2[0] - o1[0];
        else
            return o2[1] - o1[1];
    })

    console.log(K + " numbers with most occurrences are: ");
    for (let i = 0; i < K; i++)
       console.log(list[i][0] + " ");
}

// Driver's Code
let arr = [3, 1, 4, 4, 5, 2, 6, 1];
let N = arr.length;
let K = 2;
topKFrequent(arr, N, K);
