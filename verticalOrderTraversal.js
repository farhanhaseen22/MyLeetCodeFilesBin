console.time('Execution Time');
 
for (var i = 0; i < 1000;i++);
 
console.timeEnd('Time End');

// var verticalTraversal = function(root) {
//     const nodeInfos = []; // holds the x, y, & val information of each node traversed
    
//     getNodeInfos(root, 0, 0);
	
// 	// sort by the following order of importance:
// 	//  1. x - coordinate
// 	//  2. y - coordinate precedence given to higher value
// 	//  3. node val in ascending order
	
//     nodeInfos.sort((a, b) => a[0] - b[0] || b[1] - a[1] || a[2] - b[2]);
    
//     const map = new Map();
    
//     for (const [x, y, val] of nodeInfos) {
//         if (!map.has(x)) map.set(x, []);
//         map.get(x).push(val);
//     }
    
//     return [...map.values()];
    
//     function getNodeInfos(node, x, y) {
//         if (node) {
//             getNodeInfos(node.left, x - 1, y - 1); // traverse left
// 			nodeInfos.push([x, y, node.val]);
//             getNodeInfos(node.right, x + 1, y - 1); // traverse right
//         }
//     }
// };