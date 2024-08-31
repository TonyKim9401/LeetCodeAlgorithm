# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        self.i = 0  # inorder 배열의 인덱스
        self.p = 0  # preorder 배열의 인덱스

        def builder(stop):
            if self.p >= len(preorder):
                return None
            if inorder[self.i] == stop:
                self.i += 1
                return None

            # 새로운 노드 생성
            node = TreeNode(preorder[self.p])
            self.p += 1

            # 왼쪽 서브트리 생성
            node.left = builder(node.val)
            # 오른쪽 서브트리 생성
            node.right = builder(stop)

            return node

        # 트리 생성 시작
        return builder(float('-inf'))