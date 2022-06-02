# Recursive Entries
class _Entry:
    def __init__(self, value=None, next=None):
        self.value = value
        self.next = next


# Wrapper
class List:
    def __init__(self, first=None):
        self.first = first
        self.last = first
        if self.last == None:
            return
        while self.last.next != None:
            self.last = self.last.next
