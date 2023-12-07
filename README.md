# Quiz #3: Uninvoked private methods.

Your submission must satisfy the following requirements:

* R1. Shall initialize your assignment repository from 
* R2. Write your `app_analyzer.py` in the repository.
* R3. Test your `app_analyzer.py` by using `pytest`.
* R4. You need to let your TA know your repository URL and your student ID together via Slack.
* R5. Check out `test_analyzer1.py` to figure out the output format.
* R6. Assume that there are nested classes/methods and anonymous classes.
* R7. Assume that there are nested directories in the input path.
* R8. The function `collect_uninvoked_private(...)` takes a path of a directory containing multiple java source code files, and produces a map of classes. The keys of the map are classes and the values are a set of private methods that are never invoked in their own classes. If a class has no uninvoked methods, its value should empty set (`set()`).
* R9. The constructors should be considered.
* R10. Assume that no methods (including constructors) are overloaded.
* R11. "static" methods should be considered.
* R12. Consider only (member, parameters, or local) variables whose type is obvious. Ignore variables with unknown types.
* R13. The returned value of the above functions should include **ONLY** classes defined in the java files.

## Note:

* N1. `pytest` (based on `test_analyzer1.py`) is just for validating your program. The final grading will be made by other test cases.
* N2. Submissions via GitHub Classroom will only be accepted. Submissions via LMS or any other means are not accepted.
* N3. DO NOT change files in this repository except for `app_analyzer.py`. Adding new files are allowed.
* N4. Late submissions after 2:45pm are *NOT* allowed.


