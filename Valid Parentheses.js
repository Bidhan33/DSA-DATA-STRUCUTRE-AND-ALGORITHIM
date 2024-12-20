function ispar(s) {

    // Declare a stack to hold the previous brackets.
    let stk = [];
    for (let i = 0; i < s.length; i++) {
    
        // Check if the character is an opening bracket
        if (s[i] === '(' || s[i] === '{' || s[i] === '[') {
            stk.push(s[i]);
        } else {
        

            
            if (stk.length > 0 &&
                ((stk[stk.length - 1] === '(' && s[i] === ')') ||
                 (stk[stk.length - 1] === '{' && s[i] === '}') ||
                 (stk[stk.length - 1] === '[' && s[i] === ']'))) {
                stk.pop(); // Pop the matching opening bracket
            } else {
                return false; // Unmatched closing bracket
            }
        }
    }
    
    // If stack is empty, return true (balanced), otherwise false
    return stk.length === 0;
}

let s = "{()}[]";

// Function call
console.log(ispar(s) ? "true" : "false");
