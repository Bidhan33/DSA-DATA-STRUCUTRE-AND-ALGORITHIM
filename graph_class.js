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
