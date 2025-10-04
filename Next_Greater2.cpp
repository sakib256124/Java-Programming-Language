#include <iostream>
#include <vector>
#include <stack>
#include <map>
using namespace std;

// Function to compute next greater element mapping
vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
    map<int, int> m;      // stores mapping: element -> next greater
    stack<int> s;

    // Build map for nums2 using a monotonic decreasing stack
    for (int i = nums2.size() - 1; i >= 0; i--) {
        while (!s.empty() && nums2[i] >= s.top()) {
            s.pop();
        }
        if (s.empty()) {
            m[nums2[i]] = -1;
        } else {
            m[nums2[i]] = s.top();
        }
        s.push(nums2[i]);
    }

    // Prepare answer for nums1 based on the map
    vector<int> ans;
    for (int x : nums1) {
        if (m.find(x) != m.end()) {
            ans.push_back(m[x]);
        } else {
            ans.push_back(-1); // if x not in nums2
        }
    }
    return ans;
}

int main() {
    vector<int> nums1 = {6, 8, 0, 1, 3, 4};
    vector<int> nums2 = {8, 0, 3};

    vector<int> result = nextGreaterElement(nums1, nums2);

    cout << "Next Greater Elements: ";
    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
