import { useParams, useSearchParams } from "react-router-dom";

type BoardParams = {
  boardid: string;
};

export default function Board() {
  const params = useParams(); // PathValuable 방식
  const { boardid } = useParams<BoardParams>();
  const [searchParams] = useSearchParams(); // Parameter 방식
  const page = searchParams.get("page"); // get(파라미터이름)
  const keyword = searchParams.get("keyword");
  console.log(params);
  console.log(searchParams);
  return (
    <div>
      <h1>{boardid}</h1>
      <h3>{page}</h3>
      <h3>{keyword}</h3>
    </div>
  );
}
