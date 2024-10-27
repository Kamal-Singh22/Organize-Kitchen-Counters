# Organize-Kitchen-Counters
A restaurant kitchen needs to organize its counters by shifting all empty counters  to the end, while preserving the order of the counters holding plates. Given an array plates representing the state of each counter, create a function that rearranges the counters in this way.

We create a list of only non-empty counters (plates_only).
Calculate the empty counter count by subtracting the length of plates_only from the original plates list.
Append 0s to the end of the plates_only list to form the final organized list, ensuring that the order of plates is preserved and all 0s are at the end.