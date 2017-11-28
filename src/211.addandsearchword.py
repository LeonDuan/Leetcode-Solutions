class WordDictionary:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.words = {}

    def addWord(self, word):
        """
        Adds a word into the data structure.
        :type word: str
        :rtype: void
        """
        word_len = len(word)
        if word_len in self.words:
            self.words[word_len].add(word)
        else:
            self.words[word_len] = set([word])

    def search(self, word):
        """
        Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
        :type word: str
        :rtype: bool
        """
        word_len = len(word)
        if not word_len in self.words: return False
        
        s = self.words[word_len]
        for s_word in s:
            for i in range(len(s_word)):
                if word[i] == '.' or word[i] == s_word[i]:
                    if i == word_len - 1:
                        return True
                    else:
                        continue
                else:
                    break;
        return False
        


# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)