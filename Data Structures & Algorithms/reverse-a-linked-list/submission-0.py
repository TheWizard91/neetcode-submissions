# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        a=[]
        i=0
        l=head
        while l != None:
            a.append(l.val)
            l=l.next
            i+=1
        # a=a[]
        l=head
        print("a",a)
        for e in reversed(a):
            l.val=e
            l=l.next
        return head