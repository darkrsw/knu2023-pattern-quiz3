from app_analyzer import collect_uninvoked_private

test_input_path = "./src/"


def test_class_forest():
    expected = {
        "A": {"A"},
        "B": set(),
        "C": {"func4"}
    }

    result = collect_class_forest(test_input_path)
    assert expected == result
