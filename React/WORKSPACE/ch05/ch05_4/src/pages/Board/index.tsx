import { useMemo } from "react";
import { Title } from "../../components";
import CreateListForm from "./CreateListForm";
import BoardList from "../BoardList";
import { DragDropContext } from "@hello-pangea/dnd";
import { useLists } from "../../store/useLists";

export default function Board() {
  const { lists, onCreateList, onRemoveList, onMoveList, onDragEnd } =
    useLists();
  const children = useMemo(
    () =>
      lists.map((list, index) => (
        <BoardList
          key={list.uuid}
          list={list}
          onRemoveList={onRemoveList(list.uuid)}
          index={index}
          onMoveList={onMoveList}
        />
      )),
    [lists, onRemoveList, onMoveList],
  );

  return (
    <section className="mt-4">
      <Title>Board</Title>
      <DragDropContext onDragEnd={onDragEnd}>
        {/* <ListDroppable className="flex flex-row p-2 mt-4"> */}
        <div className="flex flex-wrap p-2 mt-4">
          {children}
          <CreateListForm onCreateList={onCreateList} />
        </div>
        {/* </ListDroppable> */}
      </DragDropContext>
    </section>
  );
}
