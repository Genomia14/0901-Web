import { Div, Title, Subtitle } from "../components";
import * as D from "../data";

export default function JustifyCenterTest() {
  const boxes = D.range(0, 5).map((index) => (
    <Div key={index} className="w-4 h-4 m-1 bg-black" />
  ));
  return (
    <section className="mt-4">
      <Title>JustifyCenterTest</Title>
      <div className="mt-4">
        <Subtitle>flex flex-row justify-center</Subtitle>
        <div className="flex flex-row justify-center h-40 bg-gray-300">
          {boxes}
        </div>
      </div>
      <div className="mt-4">
        <Subtitle>flex flex-col justify-center</Subtitle>
        <div className="flex flex-col justify-center h-40 bg-gray-300">
          {boxes}
        </div>
      </div>
      <div className="mt-4">
        <Subtitle>flex flex-col justify-between</Subtitle>
        <div className="flex flex-col justify-between h-40 bg-gray-300">
          {boxes}
        </div>
      </div>
      <div className="mt-4">
        <Subtitle>flex flex-row justify-between</Subtitle>
        <div className="flex flex-row justify-between h-40 bg-gray-300">
          {boxes}
        </div>
      </div>
      <div className="mt-4">
        <Subtitle>flex flex-row justify-around</Subtitle>
        <div className="flex flex-row justify-around h-40 bg-gray-300">
          {boxes}
        </div>
      </div>
      <div className="mt-4">
        <Subtitle>flex flex-row justify-evenly</Subtitle>
        <div className="flex flex-row h-40 bg-gray-300 justify-evenly">
          {boxes}
        </div>
      </div>
    </section>
  );
}
