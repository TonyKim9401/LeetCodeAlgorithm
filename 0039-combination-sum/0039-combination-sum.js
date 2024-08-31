var combinationSum = function(candidates, target) {
    const result = [];
    
    const backtrack = (remainingTarget, startIdx, currentCombination) => {
        if (remainingTarget === 0) {
            result.push([...currentCombination]);
            return;
        }
        
        if (remainingTarget < 0) return;

        for (let i = startIdx; i < candidates.length; i++) {
            currentCombination.push(candidates[i]);
            backtrack(remainingTarget - candidates[i], i, currentCombination);
            currentCombination.pop();
        }
    };
    
    backtrack(target, 0, []);
    
    return result;
};