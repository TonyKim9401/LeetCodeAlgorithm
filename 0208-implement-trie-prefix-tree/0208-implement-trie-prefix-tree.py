class TrieNode:
    def __init__(self):
        self.children = [None] * 26  # 26 English letters
        self.isEndOfWord = False

class Trie(object):

    def __init__(self):
        self.root = TrieNode()

    def insert(self, word):
        node = self.root
        for char in word:
            idx = ord(char) - ord('a')
            if not node.children[idx]:
                node.children[idx] = TrieNode()
            node = node.children[idx]
        node.isEndOfWord = True

    def search(self, word):
        node = self.searchPrefix(word)
        return node is not None and node.isEndOfWord

    def startsWith(self, prefix):
        return self.searchPrefix(prefix) is not None

    def searchPrefix(self, word):
        node = self.root
        for char in word:
            idx = ord(char) - ord('a')
            if not node.children[idx]:
                return None
            node = node.children[idx]
        return node

# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)
