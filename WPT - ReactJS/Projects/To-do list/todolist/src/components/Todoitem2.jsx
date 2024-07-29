function TodoItem2() {
  let todoName = "Go to College";
  let todoDate = "24/05/2024";

  return (
    <div class="container">
      <div class="row row1">
        <div class="col-6">{todoName}</div>
        <div class="col-4">{todoDate}</div>
        <div class="col-2">
          <button type="button" class="btn btn-danger button1">
            Delete
          </button>
        </div>
      </div>
    </div>
  );
}

export default TodoItem2;
