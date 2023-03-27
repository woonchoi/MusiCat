import { useState } from "react";
import { v4 as uuidv4 } from "uuid";
import style from "./SongList.module.css";
import { Modal } from "@/components/common/modal/Modal";
import { SongDetailModal } from "./songDetailModal/SongDetailModal";
import { getSongList, Song } from "@/connect/axios/queryHooks/music";
import { $ } from "@/connect/axios/setting";

export const SongList = () => {
  const { data: songs } = getSongList();
  const [selectedSong, setSelectedSong] = useState<Song | null>(null);

  const userSeq = 1;

  console.log(songs);

  const [isSongDetailModalOpen, setIsSongDetailModalOpen] = useState(false);

  const onSongDetail = (e: React.MouseEvent<HTMLButtonElement>) => {
    const value = e.currentTarget.value;
    const song = JSON.parse(value);
    setSelectedSong(song);
    setIsSongDetailModalOpen(true);
  };

  if (!songs) {
    return <div>로딩 중...</div>;
  }

  const songList: JSX.Element[] = songs.map((song) => (
    <div className={style.songList} key={uuidv4()}>
      {song.userSeq === userSeq ? (
        <span className={style.userSongSpan}>
          {song.musicTitle} - {song.musicArtist}
        </span>
      ) : song.isMusicPlayed ? (
        <span className={style.playingSongSpan}>
          {song.musicTitle} - {song.musicArtist}
        </span>
      ) : (
        <span className={style.songSpan}>
          {song.musicTitle} - {song.musicArtist}
        </span>
      )}

      <button
        className={style.songBtn}
        value={JSON.stringify(song)}
        onClick={onSongDetail}
      >
        ...
      </button>
    </div>
  ));

  const songDetailModal = selectedSong ? (
    <SongDetailModal song={selectedSong} />
  ) : null;

  return (
    <>
      <div>{songList}</div>
      {isSongDetailModalOpen && (
        <Modal setModalOpen={setIsSongDetailModalOpen}>
          <div>{songDetailModal}</div>
        </Modal>
      )}
    </>
  );
};