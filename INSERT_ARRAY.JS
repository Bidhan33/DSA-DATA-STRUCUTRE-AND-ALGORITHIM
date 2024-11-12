// javascript Program to Insert an element
// at a specific position in an Array
function insertElement(arr, n, x, pos)
{
    // shift elements to the right
    // which are on the right side of pos
    var i = n - 1;
    for (i; i >= pos; i--)
    {
        arr[i + 1] = arr[i];
    }
    arr[pos] = x;
}
