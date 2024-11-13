function Graph(v) { 
this.vertices = v; 
this.vertexList = []; 
this.edges = 0;
  this.adj = []; 
for (var i = 0; i < this.vertices; ++i) { 
this.adj[i] = []; 
this.adj[i].push(""); 
} 
this.addEdge = addEdge; 
this.showGraph = showGraph; 
this.dfs = dfs; 
this.marked = []; 
for (var i = 0; i < this.vertices; ++i) { 
this.marked[i] = false; 
} 
this.bfs = bfs; 
this.edgeTo = []; 
this.hasPathTo = hasPathTo; 
this.pathTo = pathTo; 
this.topSortHelper = topSortHelper; 
this.topSort = topSort; 
}
function topSort() { 
var stack = []; 
var visited = []; 
for (var i = 0; i < this.vertices; i++) { 
visited[i] = false; 
} 
for (var i = 0; i < this.vertices; i++) { 
if (visited[i] == false) { 
this.topSortHelper(i, visited, stack); 
} 
} 
for (var i = 0; i < stack.length; i++) { 
if (stack[i] != undefined && stack[i] != false) { 
print(this.vertexList[stack[i]]); 
} 
} 
} 
function topSortHelper(v, visited, stack) { 
visited[v] = true; 
for each (var w in this.adj[v]) { 
if (!visited[w]) { 
this.topSortHelper(visited[w], visited, stack); 
} 
} 
stack.push(v); 
} 
function addEdge(v,w) { 
this.adj[v].push(w); 
this.adj[w].push(v);
