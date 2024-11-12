Valid Parentheses

Step-by-step approach:

Declare a character stack (say temp).
Now traverse the string exp. 
If the current character is a starting bracket ( ‘(‘ or ‘{‘  or ‘[‘ ) then push it to stack.
If the current character is a closing bracket ( ‘)’ or ‘}’ or ‘]’ ) then pop from the stack and if the popped character is the matching starting bracket then fine.
Else brackets are Not Balanced.
After complete traversal, if some starting brackets are left in the stack then the expression is Not balanced, else Balanced.
![Check-Valid-Parentheses - 1](https://github.com/user-attachments/assets/d6377b43-58f2-43c2-a58d-ca3d02dbc440)

