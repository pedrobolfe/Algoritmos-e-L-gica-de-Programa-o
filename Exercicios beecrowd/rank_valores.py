def rank(arr):
    list_decrescente = sorted(set(arr), reverse=True)
    list_ranks = [0] * len(arr)
    
    for i in range(len(arr)):
        for j in range(len(list_decrescente)):
            if arr[i] == list_decrescente[j]:
                list_ranks[i] = j+1
    return list_ranks
    
    
arr = [1, 2, 3, 9, 2, 4]
print(rank(arr))
